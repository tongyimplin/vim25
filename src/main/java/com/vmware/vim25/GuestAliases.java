package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestAliases;
import com.vmware.vim25.GuestAuthAliasInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestAliases", propOrder = {"base64Cert", "aliases"})
public class GuestAliases extends DynamicData {
  @XmlElement(required = true)
  protected String base64Cert;
  
  @XmlElement(required = true)
  protected List<GuestAuthAliasInfo> aliases;
  
  public String getBase64Cert() {
    return this.base64Cert;
  }
  
  public void setBase64Cert(String paramString) {
    this.base64Cert = paramString;
  }
  
  public List<GuestAuthAliasInfo> getAliases() {
    if (this.aliases == null)
      this.aliases = new ArrayList<>(); 
    return this.aliases;
  }
}
