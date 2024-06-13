package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.Relation;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relation", propOrder = {"constraint", "name", "version"})
public class Relation extends DynamicData {
  protected String constraint;
  
  @XmlElement(required = true)
  protected String name;
  
  protected String version;
  
  public String getConstraint() {
    return this.constraint;
  }
  
  public void setConstraint(String paramString) {
    this.constraint = paramString;
  }
  
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
}
