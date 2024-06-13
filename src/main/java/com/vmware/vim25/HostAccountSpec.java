package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostAccountSpec;
import com.vmware.vim25.HostPosixAccountSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAccountSpec", propOrder = {"id", "password", "description"})
@XmlSeeAlso({HostPosixAccountSpec.class})
public class HostAccountSpec extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  protected String password;
  
  protected String description;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String paramString) {
    this.password = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
