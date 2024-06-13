package com.vmware.vim25;

import com.vmware.vim25.MethodDisabled;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodDisabled", propOrder = {"source"})
public class MethodDisabled extends RuntimeFault {
  protected String source;
  
  public String getSource() {
    return this.source;
  }
  
  public void setSource(String paramString) {
    this.source = paramString;
  }
}
