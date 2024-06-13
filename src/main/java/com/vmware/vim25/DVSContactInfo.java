package com.vmware.vim25;

import com.vmware.vim25.DVSContactInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSContactInfo", propOrder = {"name", "contact"})
public class DVSContactInfo extends DynamicData {
  protected String name;
  
  protected String contact;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getContact() {
    return this.contact;
  }
  
  public void setContact(String paramString) {
    this.contact = paramString;
  }
}
