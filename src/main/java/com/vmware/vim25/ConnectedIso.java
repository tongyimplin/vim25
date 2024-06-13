package com.vmware.vim25;

import com.vmware.vim25.ConnectedIso;
import com.vmware.vim25.OvfExport;
import com.vmware.vim25.VirtualCdrom;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedIso", propOrder = {"cdrom", "filename"})
public class ConnectedIso extends OvfExport {
  @XmlElement(required = true)
  protected VirtualCdrom cdrom;
  
  @XmlElement(required = true)
  protected String filename;
  
  public VirtualCdrom getCdrom() {
    return this.cdrom;
  }
  
  public void setCdrom(VirtualCdrom paramVirtualCdrom) {
    this.cdrom = paramVirtualCdrom;
  }
  
  public String getFilename() {
    return this.filename;
  }
  
  public void setFilename(String paramString) {
    this.filename = paramString;
  }
}
