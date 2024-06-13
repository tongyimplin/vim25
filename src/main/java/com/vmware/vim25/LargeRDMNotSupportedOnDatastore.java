package com.vmware.vim25;

import com.vmware.vim25.LargeRDMNotSupportedOnDatastore;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LargeRDMNotSupportedOnDatastore", propOrder = {"device", "datastore", "datastoreName"})
public class LargeRDMNotSupportedOnDatastore extends VmConfigFault {
  @XmlElement(required = true)
  protected String device;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  @XmlElement(required = true)
  protected String datastoreName;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public String getDatastoreName() {
    return this.datastoreName;
  }
  
  public void setDatastoreName(String paramString) {
    this.datastoreName = paramString;
  }
}
