//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.09 at 02:27:32 PM PST 
//


package edu.caltech.vao.vospace.resource;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.caltech.vao.vospace.resource package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JobSummaryQuote_QNAME = new QName("http://www.ivoa.net/xml/UWS/v1.0", "quote");
    private final static QName _Properties_QNAME = new QName("http://www.ivoa.net/xml/VOSpace/v2.0", "properties");
    private final static QName _Node_QNAME = new QName("http://www.ivoa.net/xml/VOSpace/v2.0", "node");
    private final static QName _SearchDetails_QNAME = new QName("http://www.ivoa.net/xml/VOSpace/v2.0", "searchDetails");
    private final static QName _Views_QNAME = new QName("http://www.ivoa.net/xml/VOSpace/v2.0", "views");
    private final static QName _Protocols_QNAME = new QName("http://www.ivoa.net/xml/VOSpace/v2.0", "protocols");
    private final static QName _Transfer_QNAME = new QName("http://www.ivoa.net/xml/VOSpace/v2.0", "transfer");
    private final static QName _Job_QNAME = new QName("http://www.ivoa.net/xml/UWS/v1.0", "job");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.caltech.vao.vospace.resource
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JobSummary }
     * 
     */
    public JobSummary createJobSummary() {
        return new JobSummary();
    }

    /**
     * Create an instance of {@link ContainerNodeType }
     * 
     */
    public ContainerNodeType createContainerNodeType() {
        return new ContainerNodeType();
    }

    /**
     * Create an instance of {@link NodeListType }
     * 
     */
    public NodeListType createNodeListType() {
        return new NodeListType();
    }

    /**
     * Create an instance of {@link NodeType }
     * 
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link ViewListType }
     * 
     */
    public ViewListType createViewListType() {
        return new ViewListType();
    }

    /**
     * Create an instance of {@link TransferType }
     * 
     */
    public TransferType createTransferType() {
        return new TransferType();
    }

    /**
     * Create an instance of {@link PropertyListType }
     * 
     */
    public PropertyListType createPropertyListType() {
        return new PropertyListType();
    }

    /**
     * Create an instance of {@link ProtocolListType }
     * 
     */
    public ProtocolListType createProtocolListType() {
        return new ProtocolListType();
    }

    /**
     * Create an instance of {@link GetViewsResponseType }
     * 
     */
    public GetViewsResponseType createGetViewsResponseType() {
        return new GetViewsResponseType();
    }

    /**
     * Create an instance of {@link DataNodeType }
     * 
     */
    public DataNodeType createDataNodeType() {
        return new DataNodeType();
    }

    /**
     * Create an instance of {@link LinkNodeType }
     * 
     */
    public LinkNodeType createLinkNodeType() {
        return new LinkNodeType();
    }

    /**
     * Create an instance of {@link GetPropertiesResponseType }
     * 
     */
    public GetPropertiesResponseType createGetPropertiesResponseType() {
        return new GetPropertiesResponseType();
    }

    /**
     * Create an instance of {@link StructuredDataNodeType }
     * 
     */
    public StructuredDataNodeType createStructuredDataNodeType() {
        return new StructuredDataNodeType();
    }

    /**
     * Create an instance of {@link GetProtocolsResponseType }
     * 
     */
    public GetProtocolsResponseType createGetProtocolsResponseType() {
        return new GetProtocolsResponseType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link ParamType }
     * 
     */
    public ParamType createParamType() {
        return new ParamType();
    }

    /**
     * Create an instance of {@link ViewType }
     * 
     */
    public ViewType createViewType() {
        return new ViewType();
    }

    /**
     * Create an instance of {@link CapabilityListType }
     * 
     */
    public CapabilityListType createCapabilityListType() {
        return new CapabilityListType();
    }

    /**
     * Create an instance of {@link ProtocolType }
     * 
     */
    public ProtocolType createProtocolType() {
        return new ProtocolType();
    }

    /**
     * Create an instance of {@link PropertyReferenceListType }
     * 
     */
    public PropertyReferenceListType createPropertyReferenceListType() {
        return new PropertyReferenceListType();
    }

    /**
     * Create an instance of {@link CapabilityType }
     * 
     */
    public CapabilityType createCapabilityType() {
        return new CapabilityType();
    }

    /**
     * Create an instance of {@link UnstructuredDataNodeType }
     * 
     */
    public UnstructuredDataNodeType createUnstructuredDataNodeType() {
        return new UnstructuredDataNodeType();
    }

    /**
     * Create an instance of {@link PropertyReferenceType }
     * 
     */
    public PropertyReferenceType createPropertyReferenceType() {
        return new PropertyReferenceType();
    }

    /**
     * Create an instance of {@link Parameters }
     * 
     */
    public Parameters createParameters() {
        return new Parameters();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link Jobs }
     * 
     */
    public Jobs createJobs() {
        return new Jobs();
    }

    /**
     * Create an instance of {@link ShortJobDescription }
     * 
     */
    public ShortJobDescription createShortJobDescription() {
        return new ShortJobDescription();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link ResultReference }
     * 
     */
    public ResultReference createResultReference() {
        return new ResultReference();
    }

    /**
     * Create an instance of {@link ErrorSummary }
     * 
     */
    public ErrorSummary createErrorSummary() {
        return new ErrorSummary();
    }

    /**
     * Create an instance of {@link JobSummary.JobInfo }
     * 
     */
    public JobSummary.JobInfo createJobSummaryJobInfo() {
        return new JobSummary.JobInfo();
    }

    /**
     * Create an instance of {@link ContainerNodeType.Nodes }
     * 
     */
    public ContainerNodeType.Nodes createContainerNodeTypeNodes() {
        return new ContainerNodeType.Nodes();
    }

    /**
     * Create an instance of {@link NodeListType.Nodes }
     * 
     */
    public NodeListType.Nodes createNodeListTypeNodes() {
        return new NodeListType.Nodes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ivoa.net/xml/UWS/v1.0", name = "quote", scope = JobSummary.class)
    public JAXBElement<XMLGregorianCalendar> createJobSummaryQuote(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_JobSummaryQuote_QNAME, XMLGregorianCalendar.class, JobSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ivoa.net/xml/VOSpace/v2.0", name = "properties")
    public JAXBElement<PropertyListType> createProperties(PropertyListType value) {
        return new JAXBElement<PropertyListType>(_Properties_QNAME, PropertyListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ivoa.net/xml/VOSpace/v2.0", name = "node")
    public JAXBElement<NodeType> createNode(NodeType value) {
        return new JAXBElement<NodeType>(_Node_QNAME, NodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ivoa.net/xml/VOSpace/v2.0", name = "searchDetails")
    public JAXBElement<NodeListType> createSearchDetails(NodeListType value) {
        return new JAXBElement<NodeListType>(_SearchDetails_QNAME, NodeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ivoa.net/xml/VOSpace/v2.0", name = "views")
    public JAXBElement<ViewListType> createViews(ViewListType value) {
        return new JAXBElement<ViewListType>(_Views_QNAME, ViewListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ivoa.net/xml/VOSpace/v2.0", name = "protocols")
    public JAXBElement<ProtocolListType> createProtocols(ProtocolListType value) {
        return new JAXBElement<ProtocolListType>(_Protocols_QNAME, ProtocolListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ivoa.net/xml/VOSpace/v2.0", name = "transfer")
    public JAXBElement<TransferType> createTransfer(TransferType value) {
        return new JAXBElement<TransferType>(_Transfer_QNAME, TransferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ivoa.net/xml/UWS/v1.0", name = "job")
    public JAXBElement<JobSummary> createJob(JobSummary value) {
        return new JAXBElement<JobSummary>(_Job_QNAME, JobSummary.class, null, value);
    }

}
