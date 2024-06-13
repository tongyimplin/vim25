package com.vmware.vim25;

import com.vmware.vim25.ConflictingDatastoreFound;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConflictingDatastoreFound", propOrder = {"name", "url"})
public class ConflictingDatastoreFound extends RuntimeFault {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String url;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
}
