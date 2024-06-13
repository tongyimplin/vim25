package com.vmware.vim25;

import com.vmware.vim25.Description;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtExtendedProductInfo;
import com.vmware.vim25.ExtManagedEntityInfo;
import com.vmware.vim25.ExtSolutionManagerInfo;
import com.vmware.vim25.Extension;
import com.vmware.vim25.ExtensionClientInfo;
import com.vmware.vim25.ExtensionEventTypeInfo;
import com.vmware.vim25.ExtensionFaultTypeInfo;
import com.vmware.vim25.ExtensionHealthInfo;
import com.vmware.vim25.ExtensionOvfConsumerInfo;
import com.vmware.vim25.ExtensionPrivilegeInfo;
import com.vmware.vim25.ExtensionResourceInfo;
import com.vmware.vim25.ExtensionServerInfo;
import com.vmware.vim25.ExtensionTaskTypeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extension", propOrder = {"description", "key", "company", "type", "version", "subjectName", "server", "client", "taskList", "eventList", "faultList", "privilegeList", "resourceList", "lastHeartbeatTime", "healthInfo", "ovfConsumerInfo", "extendedProductInfo", "managedEntityInfo", "shownInSolutionManager", "solutionManagerInfo"})
public class Extension extends DynamicData {
  @XmlElement(required = true)
  protected Description description;
  
  @XmlElement(required = true)
  protected String key;
  
  protected String company;
  
  protected String type;
  
  @XmlElement(required = true)
  protected String version;
  
  protected String subjectName;
  
  protected List<ExtensionServerInfo> server;
  
  protected List<ExtensionClientInfo> client;
  
  protected List<ExtensionTaskTypeInfo> taskList;
  
  protected List<ExtensionEventTypeInfo> eventList;
  
  protected List<ExtensionFaultTypeInfo> faultList;
  
  protected List<ExtensionPrivilegeInfo> privilegeList;
  
  protected List<ExtensionResourceInfo> resourceList;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastHeartbeatTime;
  
  protected ExtensionHealthInfo healthInfo;
  
  protected ExtensionOvfConsumerInfo ovfConsumerInfo;
  
  protected ExtExtendedProductInfo extendedProductInfo;
  
  protected List<ExtManagedEntityInfo> managedEntityInfo;
  
  protected Boolean shownInSolutionManager;
  
  protected ExtSolutionManagerInfo solutionManagerInfo;
  
  public Description getDescription() {
    return this.description;
  }
  
  public void setDescription(Description paramDescription) {
    this.description = paramDescription;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getCompany() {
    return this.company;
  }
  
  public void setCompany(String paramString) {
    this.company = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public String getSubjectName() {
    return this.subjectName;
  }
  
  public void setSubjectName(String paramString) {
    this.subjectName = paramString;
  }
  
  public List<ExtensionServerInfo> getServer() {
    if (this.server == null)
      this.server = new ArrayList<>(); 
    return this.server;
  }
  
  public List<ExtensionClientInfo> getClient() {
    if (this.client == null)
      this.client = new ArrayList<>(); 
    return this.client;
  }
  
  public List<ExtensionTaskTypeInfo> getTaskList() {
    if (this.taskList == null)
      this.taskList = new ArrayList<>(); 
    return this.taskList;
  }
  
  public List<ExtensionEventTypeInfo> getEventList() {
    if (this.eventList == null)
      this.eventList = new ArrayList<>(); 
    return this.eventList;
  }
  
  public List<ExtensionFaultTypeInfo> getFaultList() {
    if (this.faultList == null)
      this.faultList = new ArrayList<>(); 
    return this.faultList;
  }
  
  public List<ExtensionPrivilegeInfo> getPrivilegeList() {
    if (this.privilegeList == null)
      this.privilegeList = new ArrayList<>(); 
    return this.privilegeList;
  }
  
  public List<ExtensionResourceInfo> getResourceList() {
    if (this.resourceList == null)
      this.resourceList = new ArrayList<>(); 
    return this.resourceList;
  }
  
  public XMLGregorianCalendar getLastHeartbeatTime() {
    return this.lastHeartbeatTime;
  }
  
  public void setLastHeartbeatTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lastHeartbeatTime = paramXMLGregorianCalendar;
  }
  
  public ExtensionHealthInfo getHealthInfo() {
    return this.healthInfo;
  }
  
  public void setHealthInfo(ExtensionHealthInfo paramExtensionHealthInfo) {
    this.healthInfo = paramExtensionHealthInfo;
  }
  
  public ExtensionOvfConsumerInfo getOvfConsumerInfo() {
    return this.ovfConsumerInfo;
  }
  
  public void setOvfConsumerInfo(ExtensionOvfConsumerInfo paramExtensionOvfConsumerInfo) {
    this.ovfConsumerInfo = paramExtensionOvfConsumerInfo;
  }
  
  public ExtExtendedProductInfo getExtendedProductInfo() {
    return this.extendedProductInfo;
  }
  
  public void setExtendedProductInfo(ExtExtendedProductInfo paramExtExtendedProductInfo) {
    this.extendedProductInfo = paramExtExtendedProductInfo;
  }
  
  public List<ExtManagedEntityInfo> getManagedEntityInfo() {
    if (this.managedEntityInfo == null)
      this.managedEntityInfo = new ArrayList<>(); 
    return this.managedEntityInfo;
  }
  
  public Boolean isShownInSolutionManager() {
    return this.shownInSolutionManager;
  }
  
  public void setShownInSolutionManager(Boolean paramBoolean) {
    this.shownInSolutionManager = paramBoolean;
  }
  
  public ExtSolutionManagerInfo getSolutionManagerInfo() {
    return this.solutionManagerInfo;
  }
  
  public void setSolutionManagerInfo(ExtSolutionManagerInfo paramExtSolutionManagerInfo) {
    this.solutionManagerInfo = paramExtSolutionManagerInfo;
  }
}
