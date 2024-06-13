package com.vmware.vim25;

import com.vmware.vim25.RebootRequired;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebootRequired", propOrder = {"patch"})
public class RebootRequired extends VimFault {
  protected String patch;
  
  public String getPatch() {
    return this.patch;
  }
  
  public void setPatch(String paramString) {
    this.patch = paramString;
  }
}
