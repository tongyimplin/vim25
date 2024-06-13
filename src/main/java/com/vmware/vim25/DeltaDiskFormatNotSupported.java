package com.vmware.vim25;

import com.vmware.vim25.DeltaDiskFormatNotSupported;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmConfigFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeltaDiskFormatNotSupported", propOrder = {"datastore", "deltaDiskFormat"})
public class DeltaDiskFormatNotSupported extends VmConfigFault {
  protected List<ManagedObjectReference> datastore;
  
  @XmlElement(required = true)
  protected String deltaDiskFormat;
  
  public List<ManagedObjectReference> getDatastore() {
    if (this.datastore == null)
      this.datastore = new ArrayList<>(); 
    return this.datastore;
  }
  
  public String getDeltaDiskFormat() {
    return this.deltaDiskFormat;
  }
  
  public void setDeltaDiskFormat(String paramString) {
    this.deltaDiskFormat = paramString;
  }
}
