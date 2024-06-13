package com.vmware.vim25;

import com.vmware.vim25.OvfHardwareExport;
import com.vmware.vim25.OvfUnableToExportDisk;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnableToExportDisk", propOrder = {"diskName"})
public class OvfUnableToExportDisk extends OvfHardwareExport {
  @XmlElement(required = true)
  protected String diskName;
  
  public String getDiskName() {
    return this.diskName;
  }
  
  public void setDiskName(String paramString) {
    this.diskName = paramString;
  }
}
