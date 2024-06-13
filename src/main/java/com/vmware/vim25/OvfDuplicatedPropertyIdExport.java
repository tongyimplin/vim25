package com.vmware.vim25;

import com.vmware.vim25.OvfDuplicatedPropertyIdExport;
import com.vmware.vim25.OvfExport;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfDuplicatedPropertyIdExport", propOrder = {"fqid"})
public class OvfDuplicatedPropertyIdExport extends OvfExport {
  @XmlElement(required = true)
  protected String fqid;
  
  public String getFqid() {
    return this.fqid;
  }
  
  public void setFqid(String paramString) {
    this.fqid = paramString;
  }
}
