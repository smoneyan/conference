-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 11, 2012 at 04:57 PM
-- Server version: 5.5.24
-- PHP Version: 5.3.10-1ubuntu3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `coms`
--
DROP DATABASE `coms`;
CREATE DATABASE `coms` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `coms`;

-- --------------------------------------------------------

--
-- Table structure for table `conf_item_type`
--
-- Creation: Nov 10, 2012 at 02:32 PM
--

DROP TABLE IF EXISTS `conf_item_type`;
CREATE TABLE IF NOT EXISTS `conf_item_type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(30) NOT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `conf_item_type`
--

INSERT INTO `conf_item_type` (`type_id`, `title`) VALUES
(1, 'paper'),
(2, 'workshop'),
(3, 'symposium'),
(4, 'tutorial');

-- --------------------------------------------------------

--
-- Table structure for table `conf_schedule`
--
-- Creation: Nov 10, 2012 at 02:41 PM
--

DROP TABLE IF EXISTS `conf_schedule`;
CREATE TABLE IF NOT EXISTS `conf_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `conf_id` int(11) NOT NULL,
  `schedule_id` int(11) NOT NULL,
  `type_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `schedule_id` (`schedule_id`),
  KEY `conf_id` (`conf_id`),
  KEY `type_id` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- RELATIONS FOR TABLE `conf_schedule`:
--   `conf_id`
--       `conference_topic` -> `id`
--   `schedule_id`
--       `schedule` -> `schedule_id`
--   `type_id`
--       `conf_item_type` -> `type_id`
--

-- --------------------------------------------------------

--
-- Table structure for table `conference`
--
-- Creation: Nov 10, 2012 at 02:19 PM
--

DROP TABLE IF EXISTS `conference`;
CREATE TABLE IF NOT EXISTS `conference` (
  `conf_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `description` varchar(400) NOT NULL,
  `location` varchar(50) DEFAULT NULL,
  `conf_dt` int(11) NOT NULL,
  `submission_last_dt` int(11) NOT NULL,
  `review_last_dt` int(11) NOT NULL,
  `last_updated` int(11) NOT NULL,
  PRIMARY KEY (`conf_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `conference_topic`
--
-- Creation: Nov 10, 2012 at 02:26 PM
--

DROP TABLE IF EXISTS `conference_topic`;
CREATE TABLE IF NOT EXISTS `conference_topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `conf_id` int(11) NOT NULL,
  `topic_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `conf_id` (`conf_id`),
  KEY `topic_id` (`topic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- RELATIONS FOR TABLE `conference_topic`:
--   `conf_id`
--       `conference` -> `conf_id`
--   `topic_id`
--       `topic` -> `tid`
--

-- --------------------------------------------------------

--
-- Table structure for table `event_log`
--
-- Creation: Nov 10, 2012 at 03:26 PM
--

DROP TABLE IF EXISTS `event_log`;
CREATE TABLE IF NOT EXISTS `event_log` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `sender_id` int(11) NOT NULL,
  `recepient_id` int(11) NOT NULL,
  `message` varchar(500) NOT NULL,
  `mark_as_read` tinyint(1) NOT NULL,
  PRIMARY KEY (`event_id`),
  KEY `sender_id` (`sender_id`),
  KEY `recepient_id` (`recepient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- RELATIONS FOR TABLE `event_log`:
--   `sender_id`
--       `user` -> `uid`
--   `recepient_id`
--       `user` -> `uid`
--

-- --------------------------------------------------------

--
-- Table structure for table `file`
--
-- Creation: Nov 10, 2012 at 03:21 PM
--

DROP TABLE IF EXISTS `file`;
CREATE TABLE IF NOT EXISTS `file` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `filename` varchar(255) NOT NULL,
  `uri` varchar(255) NOT NULL,
  `timestamp` int(11) NOT NULL,
  `filemime` varchar(255) NOT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `item_co_authors`
--
-- Creation: Nov 10, 2012 at 03:00 PM
--

DROP TABLE IF EXISTS `item_co_authors`;
CREATE TABLE IF NOT EXISTS `item_co_authors` (
  `author_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_id` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`author_id`),
  KEY `item_id` (`item_id`),
  KEY `uid` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- RELATIONS FOR TABLE `item_co_authors`:
--   `item_id`
--       `item_submission` -> `item_id`
--   `uid`
--       `user` -> `uid`
--

-- --------------------------------------------------------

--
-- Table structure for table `item_comments`
--
-- Creation: Nov 10, 2012 at 03:14 PM
--

DROP TABLE IF EXISTS `item_comments`;
CREATE TABLE IF NOT EXISTS `item_comments` (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_id` int(11) NOT NULL,
  `submitted_by` int(11) NOT NULL,
  `comment` varchar(400) NOT NULL,
  `private` tinyint(1) NOT NULL,
  PRIMARY KEY (`comment_id`),
  KEY `item_id` (`item_id`),
  KEY `submitted_by` (`submitted_by`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- RELATIONS FOR TABLE `item_comments`:
--   `item_id`
--       `item_submission` -> `item_id`
--   `submitted_by`
--       `user` -> `uid`
--

-- --------------------------------------------------------

--
-- Table structure for table `item_reviewer`
--
-- Creation: Nov 10, 2012 at 03:29 PM
--

DROP TABLE IF EXISTS `item_reviewer`;
CREATE TABLE IF NOT EXISTS `item_reviewer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_id` int(11) NOT NULL,
  `reviewer_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `item_id` (`item_id`),
  KEY `reviewer_id` (`reviewer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- RELATIONS FOR TABLE `item_reviewer`:
--   `item_id`
--       `item_submission` -> `item_id`
--   `reviewer_id`
--       `user` -> `uid`
--

-- --------------------------------------------------------

--
-- Table structure for table `item_status`
--
-- Creation: Nov 10, 2012 at 02:49 PM
--

DROP TABLE IF EXISTS `item_status`;
CREATE TABLE IF NOT EXISTS `item_status` (
  `status_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `item_submission`
--
-- Creation: Nov 10, 2012 at 03:21 PM
--

DROP TABLE IF EXISTS `item_submission`;
CREATE TABLE IF NOT EXISTS `item_submission` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_id` int(11) NOT NULL,
  `conf_id` int(11) NOT NULL,
  `schedule_id` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `submitted_by` int(11) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `fid` int(11) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `blind_review` tinyint(1) DEFAULT NULL,
  `contact_email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `type_id` (`type_id`),
  KEY `conf_id` (`conf_id`),
  KEY `schedule_id` (`schedule_id`),
  KEY `status` (`status`),
  KEY `submitted_by` (`submitted_by`),
  KEY `fid` (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- RELATIONS FOR TABLE `item_submission`:
--   `type_id`
--       `conf_item_type` -> `type_id`
--   `conf_id`
--       `conference` -> `conf_id`
--   `schedule_id`
--       `conf_schedule` -> `schedule_id`
--   `status`
--       `item_status` -> `status_id`
--   `submitted_by`
--       `user` -> `uid`
--   `fid`
--       `file` -> `fid`
--

-- --------------------------------------------------------

--
-- Table structure for table `role`
--
-- Creation: Nov 10, 2012 at 01:54 PM
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(30) NOT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`rid`, `role_name`) VALUES
(1, 'admin'),
(2, 'author'),
(3, 'co_author'),
(4, 'reviewer'),
(5, 'participant');

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--
-- Creation: Nov 10, 2012 at 02:37 PM
--

DROP TABLE IF EXISTS `schedule`;
CREATE TABLE IF NOT EXISTS `schedule` (
  `schedule_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `start_dt` datetime NOT NULL,
  `end_dt` datetime NOT NULL,
  PRIMARY KEY (`schedule_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `topic`
--
-- Creation: Nov 10, 2012 at 02:22 PM
--

DROP TABLE IF EXISTS `topic`;
CREATE TABLE IF NOT EXISTS `topic` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(30) NOT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--
-- Creation: Nov 11, 2012 at 08:57 AM
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telephone` bigint(20) DEFAULT NULL,
  `mobile` bigint(20) DEFAULT NULL,
  `work_address` varchar(200) DEFAULT NULL,
  `contact_address` varchar(200) DEFAULT NULL,
  `blog` varchar(100) DEFAULT NULL,
  `website` varchar(100) DEFAULT NULL,
  `rid` int(11) NOT NULL,
  PRIMARY KEY (`uid`),
  KEY `rid` (`rid`),
  KEY `FK36EBCB918B7479` (`rid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- RELATIONS FOR TABLE `user`:
--   `rid`
--       `role` -> `rid`
--

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`uid`, `username`, `password`, `email`, `telephone`, `mobile`, `work_address`, `contact_address`, `blog`, `website`, `rid`) VALUES
(1, 'ganesh', 'ganesh', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1),
(2, 'subu', 'subu', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2),
(3, 'admin', 'admin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1),
(4, 'author', 'author', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 3),
(5, 'co_author', 'co_author', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1),
(6, 'participant', 'participant', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 4),
(7, 'reviewer', 'reviewer', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 3);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `conf_schedule`
--
ALTER TABLE `conf_schedule`
  ADD CONSTRAINT `conf_schedule_ibfk_1` FOREIGN KEY (`conf_id`) REFERENCES `conference_topic` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `conf_schedule_ibfk_2` FOREIGN KEY (`schedule_id`) REFERENCES `schedule` (`schedule_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `conf_schedule_ibfk_3` FOREIGN KEY (`type_id`) REFERENCES `conf_item_type` (`type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `conference_topic`
--
ALTER TABLE `conference_topic`
  ADD CONSTRAINT `conference_topic_ibfk_1` FOREIGN KEY (`conf_id`) REFERENCES `conference` (`conf_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `conference_topic_ibfk_2` FOREIGN KEY (`topic_id`) REFERENCES `topic` (`tid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `event_log`
--
ALTER TABLE `event_log`
  ADD CONSTRAINT `event_log_ibfk_1` FOREIGN KEY (`sender_id`) REFERENCES `user` (`uid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `event_log_ibfk_2` FOREIGN KEY (`recepient_id`) REFERENCES `user` (`uid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `item_co_authors`
--
ALTER TABLE `item_co_authors`
  ADD CONSTRAINT `item_co_authors_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `item_submission` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `item_co_authors_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `item_comments`
--
ALTER TABLE `item_comments`
  ADD CONSTRAINT `item_comments_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `item_submission` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `item_comments_ibfk_2` FOREIGN KEY (`submitted_by`) REFERENCES `user` (`uid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `item_reviewer`
--
ALTER TABLE `item_reviewer`
  ADD CONSTRAINT `item_reviewer_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `item_submission` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `item_reviewer_ibfk_2` FOREIGN KEY (`reviewer_id`) REFERENCES `user` (`uid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `item_submission`
--
ALTER TABLE `item_submission`
  ADD CONSTRAINT `item_submission_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `conf_item_type` (`type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `item_submission_ibfk_2` FOREIGN KEY (`conf_id`) REFERENCES `conference` (`conf_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `item_submission_ibfk_3` FOREIGN KEY (`schedule_id`) REFERENCES `conf_schedule` (`schedule_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `item_submission_ibfk_4` FOREIGN KEY (`status`) REFERENCES `item_status` (`status_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `item_submission_ibfk_5` FOREIGN KEY (`submitted_by`) REFERENCES `user` (`uid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `item_submission_ibfk_6` FOREIGN KEY (`fid`) REFERENCES `file` (`fid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FK36EBCB918B7479` FOREIGN KEY (`rid`) REFERENCES `role` (`rid`),
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`rid`) REFERENCES `role` (`rid`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;