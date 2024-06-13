package com.vmware.vim25;

import com.vmware.vim25.DVPortgroupEvent;
import com.vmware.vim25.DvpgImportEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvpgImportEvent", propOrder = {"importType"})
public class DvpgImportEvent extends DVPortgroupEvent {
  @XmlElement(required = true)
  protected String importType;
  
  public String getImportType() {
    return this.importType;
  }
  
  public void setImportType(String paramString) {
    this.importType = paramString;
  }
}
