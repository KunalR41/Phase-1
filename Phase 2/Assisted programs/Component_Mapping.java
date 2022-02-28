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

HibernateUtil:-
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



ProductDetails:-
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.*;
import javax.xml.bind.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.ecommerce.EProduct;
import com.ecommerce.HibernateUtil;
import com.ecommerce.ProductParts;





@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // TODO Auto-generated method stub
          try {
                 SessionFactory factory = HibernateUtil.getSessionFactory();
                 
                 Session session = factory.openSession();
                 
                 
                  
                 List<EProduct> list = session.createQuery("from EProduct").list();
                 
                  PrintWriter out = response.getWriter();
                  out.println("<html><body>");
                  
                  out.println("<b>Component Mapping</b><br>");
                  for(EProduct p: list) {
                          out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
                                          ", Price: " + String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString());
                          ProductParts parts = ((HttpServletRequest) p).getParts();
                          out.println("Parts =" + parts.getCpu() + ", " + parts.getHdd() + ", " + parts.getRam());
                          out.println("<hr>");
                  }
                  
                         session.close();

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

ProductPart:-
public class ProductParts {

        private String hdd;
        private String cpu;
        private String ram;
        
        public String getHdd() { return this.hdd;}
        public String getCpu() { return this.cpu;}
        public String getRam() { return this.ram;}
        
        public void setHdd(String value) { this.hdd= value;}
        public void setCpu(String value) { this.cpu= value;}
        public void setRam(String value) { this.ram= value;}
        
}



