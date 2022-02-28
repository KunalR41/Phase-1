ColourCode:-
public class Color {
        private long COLORID;
        private String name;
        
        public Color() {
                
        }
        public Color(String name) {
                this.COLORID = 0;
                this.name = name;
        }
        
        public long getCOLORID() {return this.COLORID; }
        public String getName() { return this.name;}
        public void setCOLORID(long id) { this.COLORID = id;}
        public void setName(String name) { this.name = name;}
        
        
}


EProduct:-
import java.math.BigDecimal;
import java.util.Date;

public class EProduct {
        private long ID;
        private String name;
        private BigDecimal price;
        private Date dateAdded;
        
        public EProduct() {
                
        }
        public EProduct(long id, String name, BigDecimal price, Date dateAdded) {
                this.ID = id;
                this.name = name;
                this.price = price;
                this.dateAdded = dateAdded;
        }
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public BigDecimal getPrice() { return this.price;}
        public Date getDateAdded() { return this.dateAdded;}
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(BigDecimal price) { this.price = price;}
        public void setDateAdded(Date date) { this.dateAdded = date;}
        
        
}

Finance:-
public class Finance {
        private long FINANCEID;
        private String name;
        private String ftype;
        
        public Finance() {
                
        }
        public Finance(String name, String ftype) {
                this.FINANCEID = 0;
                this.name = name;
                this.ftype = ftype;
        }
        
        public long getFINANCEID() {return this.FINANCEID; }
        public String getName() { return this.name;}
        public String getFtype() { return this.ftype;}
        public void setFINANCEID(long id) { this.FINANCEID = id;}
        public void setName(String name) { this.name = name;}
        public void setFtype(String ftype) { this.ftype= ftype;}
        
        
}

Hibernate Util:-
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

        private static final SessionFactory sessionFactory;

        static {
                try {
                        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                                        .configure("hibernate.cfg.xml").build();
                        Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                        sessionFactory = metaData.getSessionFactoryBuilder().build();
                } catch (Throwable th) {
                        throw new ExceptionInInitializerError(th);
                }
        }

        public static SessionFactory getSessionFactory() {
                return sessionFactory;
        }
}

InitHibernate:-
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.xml.bind.*;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/InitHibernate")
public class InitHibernate extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
        
        
    /**
* @see HttpServlet#HttpServlet()
*/
    public InitHibernate() {
        super();
        // TODO Auto-generated constructor stub
        
    }

   
        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                 try {
                         PrintWriter out = response.getWriter();
                         out.println("<html><body>");

                         SessionFactory factory = HibernateUtil.getSessionFactory();
                                
                         Session session = factory.openSession();
                         out.println("Hibernate Session opened.<br>");
                         session.close();
                         out.println("Hibernate Session closed.<br>");
                                
                         out.println("</body></html>");
                            
                             
                         } catch (Exception ex) {
                                 throw ex;
                         }

        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}

OS:-
public class OS {

        private long OSID;
        private String name;
        
        public OS() {
                
        }
        public OS(String name) {
                this.OSID = 0;
                this.name = name;
        }
        
        public long getOSID() {return this.OSID; }
        public String getName() { return this.name;}
        public void setOSID(long id) { this.OSID = id;}
        public void setName(String name) { this.name= name;}
        
        
}

ScreenSizes:-
public class ScreenSizes {
        private long SCREENID;
        private String size;
        
        public ScreenSizes() {
                
        }
        public ScreenSizes(String size) {
                this.SCREENID = 0;
                this.size = size;
        }
        
        public long getSCREENID() {return this.SCREENID; }
        public String getSize() { return this.size;}
        public void setSCREENID(long id) { this.SCREENID = id;}
        public void setSize(String size) { this.size = size;}
        
        
}


