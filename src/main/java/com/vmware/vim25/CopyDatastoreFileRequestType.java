package com.vmware.vim25;

import com.vmware.vim25.CopyDatastoreFileRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyDatastoreFileRequestType", propOrder = {"_this", "sourceName", "sourceDatacenter", "destinationName", "destinationDatacenter", "force"})
public class CopyDatastoreFileRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String sourceName;
  
  protected ManagedObjectReference sourceDatacenter;
  
  @XmlElement(required = true)
  protected String destinationName;
  
  protected ManagedObjectReference destinationDatacenter;
  
  protected Boolean force;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getSourceName() {
    return this.sourceName;
  }
  
  public void setSourceName(String paramString) {
    this.sourceName = paramString;
  }
  
  public ManagedObjectReference getSourceDatacenter() {
    return this.sourceDatacenter;
  }
  
  public void setSourceDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.sourceDatacenter = paramManagedObjectReference;
  }
  
  public String getDestinationName() {
    return this.destinationName;
  }
  
  public void setDestinationName(String paramString) {
    this.destinationName = paramString;
  }
  
  public ManagedObjectReference getDestinationDatacenter() {
    return this.destinationDatacenter;
  }
  
  public void setDestinationDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.destinationDatacenter = paramManagedObjectReference;
  }
  
  public Boolean isForce() {
    return this.force;
  }
  
  public void setForce(Boolean paramBoolean) {
    this.force = paramBoolean;
  }
}
