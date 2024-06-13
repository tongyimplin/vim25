package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVirtualNic;
import com.vmware.vim25.HostVirtualNic;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVirtualNic", propOrder = {"hostVirtualNic"})
public class ArrayOfHostVirtualNic {
  @XmlElement(name = "HostVirtualNic")
  protected List<HostVirtualNic> hostVirtualNic;
  
  public List<HostVirtualNic> getHostVirtualNic() {
    if (this.hostVirtualNic == null)
      this.hostVirtualNic = new ArrayList<>(); 
    return this.hostVirtualNic;
  }
}
