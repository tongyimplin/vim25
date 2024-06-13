package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.Relation;
import com.vmware.vim25.SoftwarePackage;
import com.vmware.vim25.SoftwarePackageCapability;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwarePackage", propOrder = {"name", "version", "type", "vendor", "acceptanceLevel", "summary", "description", "referenceURL", "creationDate", "depends", "conflicts", "replaces", "provides", "maintenanceModeRequired", "hardwarePlatformsRequired", "capability", "tag", "payload"})
public class SoftwarePackage extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String version;
  
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected String vendor;
  
  @XmlElement(required = true)
  protected String acceptanceLevel;
  
  @XmlElement(required = true)
  protected String summary;
  
  @XmlElement(required = true)
  protected String description;
  
  protected List<String> referenceURL;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar creationDate;
  
  protected List<Relation> depends;
  
  protected List<Relation> conflicts;
  
  protected List<Relation> replaces;
  
  protected List<String> provides;
  
  protected Boolean maintenanceModeRequired;
  
  protected List<String> hardwarePlatformsRequired;
  
  @XmlElement(required = true)
  protected SoftwarePackageCapability capability;
  
  protected List<String> tag;
  
  protected List<String> payload;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getVendor() {
    return this.vendor;
  }
  
  public void setVendor(String paramString) {
    this.vendor = paramString;
  }
  
  public String getAcceptanceLevel() {
    return this.acceptanceLevel;
  }
  
  public void setAcceptanceLevel(String paramString) {
    this.acceptanceLevel = paramString;
  }
  
  public String getSummary() {
    return this.summary;
  }
  
  public void setSummary(String paramString) {
    this.summary = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public List<String> getReferenceURL() {
    if (this.referenceURL == null)
      this.referenceURL = new ArrayList<>(); 
    return this.referenceURL;
  }
  
  public XMLGregorianCalendar getCreationDate() {
    return this.creationDate;
  }
  
  public void setCreationDate(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.creationDate = paramXMLGregorianCalendar;
  }
  
  public List<Relation> getDepends() {
    if (this.depends == null)
      this.depends = new ArrayList<>(); 
    return this.depends;
  }
  
  public List<Relation> getConflicts() {
    if (this.conflicts == null)
      this.conflicts = new ArrayList<>(); 
    return this.conflicts;
  }
  
  public List<Relation> getReplaces() {
    if (this.replaces == null)
      this.replaces = new ArrayList<>(); 
    return this.replaces;
  }
  
  public List<String> getProvides() {
    if (this.provides == null)
      this.provides = new ArrayList<>(); 
    return this.provides;
  }
  
  public Boolean isMaintenanceModeRequired() {
    return this.maintenanceModeRequired;
  }
  
  public void setMaintenanceModeRequired(Boolean paramBoolean) {
    this.maintenanceModeRequired = paramBoolean;
  }
  
  public List<String> getHardwarePlatformsRequired() {
    if (this.hardwarePlatformsRequired == null)
      this.hardwarePlatformsRequired = new ArrayList<>(); 
    return this.hardwarePlatformsRequired;
  }
  
  public SoftwarePackageCapability getCapability() {
    return this.capability;
  }
  
  public void setCapability(SoftwarePackageCapability paramSoftwarePackageCapability) {
    this.capability = paramSoftwarePackageCapability;
  }
  
  public List<String> getTag() {
    if (this.tag == null)
      this.tag = new ArrayList<>(); 
    return this.tag;
  }
  
  public List<String> getPayload() {
    if (this.payload == null)
      this.payload = new ArrayList<>(); 
    return this.payload;
  }
}
