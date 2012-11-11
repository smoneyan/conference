package coms.dataaccess;

public abstract class DAOFactory {
   
    public abstract UserDAO getUserDAO();
    public abstract RoleDAO getRoleDAO();
    public abstract TopicDAO getTopicDAO();
    public abstract ConferenceDAO getConferenceDAO();
    
    private static DAOFactory instance;
    
   
    
    public static DAOFactory getInstance() {
        
        instance = loadInstance();
        
        return instance;
    }
    
   
    private static DAOFactory loadInstance(){
        
               return new coms.dataaccess.hibernate.DAOFactoryImpl();
                
        
    }
    
}