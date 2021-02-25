#JavaEE

1. Using java 8
2. Maria DB (Same MysSQL)
3. JPA 2.2 or higher
4. Maven

##JPA
JPA (Java Persistence API) is an api in Java that allows you to handle databases.
It's a motherClass to:
- OpenJPA
- Hibernate
- EclipseLink
JPA is ORM (Object/Relational Mapping).
- Basically, you will need to write this:

`
EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
EntityManager em = emf.createEntityManager();
`

- To persiste you have to put your commands inside a transaction. Transactions are good pratcices methods to deal with databases.
    + First the transaction validate your SQL. It's a atomic form to handle DB persistence. 
- First you have do begin a transaction, then you put your SQL code, after you commit your transaction to take effect on the DB.
`
        em.getTransaction().begin();
        
        em.persist(conta);
        
        em.getTransaction().commit();
`
- Other imortant thing is knowing what a "Managed" status is. When you request an object from a DB, the JPA gives you a managed object.
- Managed object: It's an object known by the JPA and the model at the same time.
`
Conta contaDoCliente = em.find(Conta.class, 1L); //To find a register in a DB.
`
- em.close(): close de transaction. An object become "Detached"after a closing transaction, hence, any changes in it will not be persisted.
- em1.merge(conta): Compares the object in the model with the object in the DB, persisting the differences in the model. Transforms a "detached" object in "managed".
- JPA states:
    + Transient: It's mapped only in Java, doesn't exist in DB.
    + Managed: It's mapped in Java and in the DB through JPA. Only state when you can manipulate data.
    + Detached: It's detached from the DB, exists only in java.
    + Removed: It's removed from DB. `em.remove(object)`;

**Notations**
- @Entity: Notation to inform that this class is an entity.
- @Id: Indicates a PK
- @GeneratedValue(strategy = GenerationType.IDENTITY): PK auto-increment.
- @Enumerated(EnumType.TYPE): Persist in DB a specific type of a variable.
- @ManyToOne: Indicates a FK.
- @JoinColumn(unique = true): Constraint.
- @OneToMany(mappedBy="attribute"): Bi-directional key, two tables connected through a FK, you don't need to have a third table. When you have a one-many relation, a FK stablish the relation.
- mappedBy: Forces the "attribute" to create a FK. Strong side, alters the DB.
- @NamedQuery(name="", query=""): Create a query and name it using this notation. Just use the name of the query in the other parts of the code. To execute it: createNamedQuery.

**Objects**
- EntityManager, main object in JPA, allows you to manipulate DDL.
    + EntityManagerFactory: Object that holds the persistence.xml file.
    + createEntityManager();: Automaticaly create tables.


##Maven
In the pom.xml you can configure the project depedencies. You need this dependence
to handle database connections and manipulation. Look in the DB page for this notation.

**Maven Configuration**
- pom.xml: Dependencies
`
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>br.com.alura.jpa</groupId>
    <artifactId>projeto-jpa</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-agroal</artifactId>
            <version>5.4.27.SP1</version>
            <type>pom</type>
        </dependency>
        <dependency>
            <groupId>javax.persistence</groupId>
            <artifactId>javax.persistence-api</artifactId>
            <version>2.2</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.23</version>
        </dependency>
    </dependencies>
</project>
`
- Basically, including <dependencies> on POM file.
- main > resources > meta-inf > persistence.xml: configuration to connect and maintain databases.
- persistence.xml example:
`
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://java.sun.com/xml/ns/persistence
        http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
    version="2.0">

    <persistence-unit name="contas">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
        <class>br.com.alura.jpa.modelo.Conta</class>

        <properties>
            <property name="javax.persistence.jdbc.driver"
                value="com.mysql.jdbc.Driver" />
            <property name="javax.persistence.jdbc.url"
                value="jdbc:mysql://localhost/alura_jpa" />
            <property name="javax.persistence.jdbc.user" value="root" />
            <property name="javax.persistence.jdbc.password"
                value="pass" />

            <property name="hibernate.dialect"
                value="org.hibernate.dialect.MySQL5InnoDBDialect" />
            <property name="hibernate.show_sql" value="true" />
            <property name="hibernate.format_sql" value="true" />

            <property name="hibernate.hbm2ddl.auto" value="update" />

        </properties>
    </persistence-unit>
</persistence>
`
Some explanation:
-  <provider>: It's a class that handle everything.
- javax.persistence.jdbc.driver: Which driver you will use.
- javax.persistence.jdbc.url: where the DB is.
- javax.persistence.jdbc.user: username to access the DB.
- javax.persistence.jdbc.password: password for this user above.
- hibernate.dialect: Language that you will use to comunicate with the DB. Some DB has different sintaxes.
- hibernate.show_sql: Printing SQL in console.
- hibernate.format_sql: See SQL formated in console.
- hibernate.hbm2ddl.auto: Automatic create DDL from classes.
- <class></class>: Project's FQN, it's important to look at this because your code must be in the same FQN.

##JPQL
It's a class that allows you to handle SQL queries without the need to know specifics of DB structure, you only need to know classes and attributes.
- join fetch: inner join. It'll reduce the amount of queries executed.
- join left/right: left join or right join in SQL.
- You can instantiate an object when creating a string that store a SQL, ex: 'select new FQN of the class'. Use a constructor to store this information.

##Criteria
CriteriaBuilder (Build the criteria) > CriteriaQuery (build the query) > Root (access attributes) > Operation.
- Criteria is utilized for dynamic queries.
- Criteria allows you to access attributes in a class mapped in a DB.

##WebContainer x EJB Container
- Web Container: It's simple and http oriented.
- EJB Container: It's design for web application, contains API's used by web apps.
    + GlassFish, WildFly.
- Jakarta and Java is the same thing.

##Java EE Architecture
- User > HTTP requisition to access web app.
- Web App:
    + HTTP layer: Handle requests transforming it in objects.
    + Business layer: handle business rules, the proposition of the software.
    + DB layer:
        * Transactions: Begin, commit, close, talking to DB.
        * Persistance: Inserting data into the DB.
        * Connection Pool: Connection between webApp and DB.
    + Queues: Handling paralelism.
- Web Server provide:
    + HTTP, transactions, peristance, conection pools and queues. 

##Wildfly
- It's a webServer with EJB Container and Web Container.
- On standalone: max-pool-size="20" instead of derive-size="from-worker-pools" stablish a static number of pools in your server. That means if the 20 pools are being used, the next requisition will wait until a pool is available.
    + OutOfMemory workOut.
- Inserting server user:
`
1º - Acesse a pasta wildfly-20.0.1.Final\bin.

2º - Execute, via CMD, o add-user.bat

3º - Escolha o tipo Management User (Usuário de Administração)

4º - Escolha o username de sua preferência

5º - Defina a senha e a confirme

6º - Não é necessário definir grupos, então só é necessário apertar enter

7º - Insira yes para incluir o usuário ao ManagementRealm

8º - Insira yes para permitir que o usuário possa acessar outros AS Process

9º - Tecle qualquer tecla para continuar
`
- Inserting modules:
    + Creating modules: module add --name=com.mysql --resources="{Local em que o .jar está salvo}" --dependencies=javax.api,javax.transaction.api
    + Installing modules: /subsystem=datasources/jdbc-driver=mysql:add(driver-name=mysql,driver-module-name=com.mysql,driver-xa-datasource-class-name=com.mysql.cj.jdbc.MysqlXADataSource)
        * {"outcome" => "success"}

##EJB - Enterprise Java Beans
- Are Java Classes that handle business rules.
- You can invoke services from webserver to work with infrastructure, for instance, HTTP, DB and Queues become services provided by the webserver.
    + It's called injection.

**Notations**
- @Stateless: It's an EJB, which means, It's a layer between the server and the code. Statless means you do not have to store in memory the original objects of this class.
- @Inject: Injections of depedencies in your code, means that you are using resourcers from the server. Creates an instance of EJB.
- @Schedule(second = "15"): You can schedule a method to works by itself.
- @PersistenceContext: Automatically creates an instance of the object needed to handle DB integration, you do not have to create by hand.
    + Automatically do:
```
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(JNDI from persistence.xml); 
        // Create an objcet from EntityManager using the JNDI specified in persistence.xml.
        // The JNDI in persistence.xml is configured in the webserver datasource, maybe there's the need to use some .jar to create a connection with a DB, all configuration can be setted up in the webserver console or through command line.
        this.entityManager = entityManagerFactory.createEntityManager();
        //Create an instance of the object.

        and

        entityManager.getTransaction().begin();
        List<ClassName> resultado = entityManager.createQuery("SQL query", ClassName.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        //To execute queries in a table 
```

Ex:
```
@Stateless
public class AgendamentoEmailDAO {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    //Due to @PersistenceContext those lines are not necessary.
//  
//  private EntityManager entityManager;
//  
//  public AgendamentoEmailDAO () {
//      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AgendamentoEmailDS");
//      this.entityManager = entityManagerFactory.createEntityManager();
//     }        
//  
    public List<AgendamentoEmail> listar () {
        
        return entityManager.createQuery("SELECT ae FROM AgendamentoEmail ae", AgendamentoEmail.class).getResultList();     
        
        //@PersistenceContext already creates an instance of this object
//      entityManager.getTransaction().begin();
//      List<AgendamentoEmail> resultado = entityManager.createQuery("SELECT ae FROM AgendamentoEmail ae", AgendamentoEmail.class).getResultList();
//      entityManager.getTransaction().commit();
//      entityManager.close();
//      
//      return resultado;
        
    }
    
    public void inserir (AgendamentoEmail agendamentoEmail) {
        entityManager.persist(agendamentoEmail);
    }
    
    
}
```

##Servlet
- Servelts are layers between the browser and the server.
- Inside a servlet you instantiate services to handle business requests to delivery information.
- Major commands:
    + doGet
    + doPost
- Servlets can be replaced by javax classes. By doing it, your code is cleaner and easier to read. However, if you have javax and servlets in the same project, servlets are prioritary.

**Notations**
- @WebServlet("resource"): which resource you are accessing, for instance: "emails"

##Javax
Study this class deeply. Handle all requisitions from webserver and it's better than servlets. (HTTP, etc)

**Notations**
- @GET: Handle get's request.
- @Produces(value = MediaType.APPLICATION_JSON): produces json.
- @POST: handle post's request.
- @Consumes(value = MediaType.APPLICATION_JSON): expects json.
- @PUT: handle put's request.

##JMS
To create a queue in a webserver like wildfly do:
- access the cmd interface.
- jms-queue add --queue-address=EmailQueue --entries=java:/jms/queue/EmailQueue

Producer:
```
    @Inject
    @JMSConnectionFactory("java:jboss/defaultJMSConnectionFactory") //default
    private JMSContext context; //Creates a producer
    
    @Resource(mappedName = "JNDIqueue")
    private Queue queue; //queue class

//    To send something to a queue
    context.createProducer().send(QueueObject, class);
```

Consumer:
```
MessageDriven(activationConfig= {
        @ActivationConfigProperty(propertyName = "destinationLookup", 
                propertyValue = "JNDIqueue"),
        @ActivationConfigProperty(propertyName = "destinationType", 
        propertyValue = "javax.jms.Queue")
})
Class implements MessageListener {

//specs    
}
```





