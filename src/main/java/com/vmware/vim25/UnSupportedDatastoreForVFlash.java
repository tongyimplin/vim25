package com.vmware.vim25;

import com.vmware.vim25.UnSupportedDatastoreForVFlash;
import com.vmware.vim25.UnsupportedDatastore;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnSupportedDatastoreForVFlash", propOrder = {"datastoreName", "type"})
public class UnSupportedDatastoreForVFlash extends UnsupportedDatastore {
  @XmlElement(required = true)
  protected String datastoreName;
  
  @XmlElement(required = true)
  protected String type;
  
  public String getDatastoreName() {
    return this.datastoreName;
  }
  
  public void setDatastoreName(String paramString) {
    this.datastoreName = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
}
