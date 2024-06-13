package com.vmware.vim25;

import com.vmware.vim25.UnsupportedVimApiVersion;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsupportedVimApiVersion", propOrder = {"version"})
public class UnsupportedVimApiVersion extends VimFault {
  protected String version;
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
}
