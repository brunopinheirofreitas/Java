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
- JSF is stateful, is store the pages for each user.

##Libs
    xmlns:h="http://java.sun.com/jsf/html" 
    xmlns:f="http://java.sun.com/jsf/core">

##ProjectStructure
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

**Cleaning a text box in front-end**
1. In xhtml you might have a default value for a field:
    `<h:inputText id="nome" value="#{autorBean.autor.nome}" />`
2. That means the inputText will always have this value `#{autorBean.autor.nome}`
3. In the beanClass you have a method that insert information in a DB:
    `public void gravar() {System.out.println("Gravando autor " + this.autor.getNome()); new DAO<Autor>(Autor.class).adiciona(this.autor);`
4. Due to the architecture of JSF (View-Controller-Model), the browser ask to the controller information to create the page true a GET method. The controller sends the HTML with this field `#{autorBean.autor.nome}` holding the last instance of the object.
5. Therefore, in this method, just add a new instance of the class, by doing so the field will be always blank: `this.autor = new Autor();`.
     
**Components tree**
1. It exists in HttpSession. Holds all the beans that the application has. 
2. For each xhtml you will have a component tree.
3. If you "ctrl+u" in a webpage you can see javax.faces.ViewState with a number value. This value is the reference of the component tree.
4. Each user accessing the website has it own component tree, that's why JSF is stateful.

**Libraries in xhtml**
- xmlns:h="http://java.sun.com/jsf/html"
- xmlns:f="http://java.sun.com/jsf/core"

1. Every "h" command for HTML comes from `http://java.sun.com/jsf/html`
2. Every "f" command for HTML comes from `http://java.sun.com/jsf/core`

**DropDown menu**
1. f:selectItem is used to add a single SelectItem to the menu, to add a whole List of SelectItems you have to use SelectItems.
`
<fieldset>
            <legend>Dados do Autor</legend>
            <h:outputLabel value="Selecione Autor: " for="autor"/>
            <h:selectOneMenu>
                <f:selectItems value="#{livroBean.autores}" var="autor" 
                    itemLabel="#{autor.name}"
                    itemValue="{autor.id}"/>                
            </h:selectOneMenu>
            <h:commandButton value="Gravar Autor"/>
        </fieldset>`
`

##JSF Components
 - `FacesContext.getCurrentInstance().addMessage("autor", new FacesMessage("Livro deve ter pelo menos um Autor."));`
     + To create a message in a page for a specific component.
- `throw new ValidatorException(new FacesMessage("ISBN must begin with number 1"));`
    + To validate a field in JSF, throwing an exception for a specfic condition.


