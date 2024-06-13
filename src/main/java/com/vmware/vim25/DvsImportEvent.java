package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsImportEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsImportEvent", propOrder = {"importType"})
public class DvsImportEvent extends DvsEvent {
  @XmlElement(required = true)
  protected String importType;
  
  public String getImportType() {
    return this.importType;
  }
  
  public void setImportType(String paramString) {
    this.importType = paramString;
  }
}
