package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestAuthSubject;
import com.vmware.vim25.GuestMappedAliases;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestMappedAliases", propOrder = {"base64Cert", "username", "subjects"})
public class GuestMappedAliases extends DynamicData {
  @XmlElement(required = true)
  protected String base64Cert;
  
  @XmlElement(required = true)
  protected String username;
  
  @XmlElement(required = true)
  protected List<GuestAuthSubject> subjects;
  
  public String getBase64Cert() {
    return this.base64Cert;
  }
  
  public void setBase64Cert(String paramString) {
    this.base64Cert = paramString;
  }
  
  public String getUsername() {
    return this.username;
  }
  
  public void setUsername(String paramString) {
    this.username = paramString;
  }
  
  public List<GuestAuthSubject> getSubjects() {
    if (this.subjects == null)
      this.subjects = new ArrayList<>(); 
    return this.subjects;
  }
}
