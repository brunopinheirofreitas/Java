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
    + Transient: It's mapped in Java.
    + Managed: It's mapped in Java and in the DB through JPA. Only state when you can manipulate data.
    + Detached: It's detached from the DB, exists only in java.
    + Removed: It's removed from DB. `em.remove(object)`;


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
- javax.persistence.jdbc.driver: Which driver you will use.
- javax.persistence.jdbc.url: where the DB is.
- javax.persistence.jdbc.user: username to access the DB.
- javax.persistence.jdbc.password: password for this user above.
- hibernate.dialect: Language that you will use to comunicate with the DB. Some DB has different sintaxes.
- hibernate.show_sql: Printing SQL in console.
- hibernate.format_sql: See SQL formated in console.
- hibernate.hbm2ddl.auto: Automatic create DDL from classes.
- <class></class>: Project's FQN, it's important to look at this because your code must be in the same FQN.

**Notations**
- @Entity: Notation to inform that this class is an entity.
- @Id: Indicates a PK
- @GeneratedValue(strategy = GenerationType.IDENTITY): PK auto-increment.

**Objects**
- EntityManager, main object in JPA, allows you to manipulate DDL.
    + EntityManagerFactory: Object that holds the persistence.xml file.
    + createEntityManager();: Automaticaly create tables.









