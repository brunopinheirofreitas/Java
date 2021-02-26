#JSF
JSF is a JAVAEE specification, however it has only basic components.
A JSF specification could have a differt implementations, for instance:
- Mojarra (javaserverfaces)
    + JavaServer Faces technology simplifies building user interfaces for JavaServer applications.
    + Libraries with elaborated components:
        * RichFaces
        * PrimeFaces
        * IceFaces
- ApacheMyfaces

#ProjectStructure
In eclipse use Dynamic Web Project. 

- Java Resources
    + Java code.

- WebContent
    + .xhtml files you put here.
        * Every html tag has its own binding command. 
        * To link a method with an action: action="#{className.method}".
            - className, not ClassName.
        * To link a value with an attribute: value="#{className.attribute}".
    + xml files:
        * web.xml
            - Configuration files.
            - Servlets.
        * faces-config.xml
            - JSF libraries configuration.

**How it works**
1. Browser send a requisition to the Servlet.
2. Servlet try to find the page /page-name
3. Servlet reads the page, creates the instances and send the response.
4. Browser receives the responde.

**Notations**
- @ManagedBean: Inform to the program that this class is managed by JSF.
    + import javax.faces.bean.ManagedBean;


