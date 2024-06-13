package com.vmware.vim25;

import com.vmware.vim25.BrowseDiagnosticLogRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowseDiagnosticLogRequestType", propOrder = {"_this", "host", "key", "start", "lines"})
public class BrowseDiagnosticLogRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected String key;
  
  protected Integer start;
  
  protected Integer lines;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public Integer getStart() {
    return this.start;
  }
  
  public void setStart(Integer paramInteger) {
    this.start = paramInteger;
  }
  
  public Integer getLines() {
    return this.lines;
  }
  
  public void setLines(Integer paramInteger) {
    this.lines = paramInteger;
  }
}
