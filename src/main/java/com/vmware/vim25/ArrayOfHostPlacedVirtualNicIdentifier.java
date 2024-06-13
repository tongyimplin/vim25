package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPlacedVirtualNicIdentifier;
import com.vmware.vim25.HostPlacedVirtualNicIdentifier;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPlacedVirtualNicIdentifier", propOrder = {"hostPlacedVirtualNicIdentifier"})
public class ArrayOfHostPlacedVirtualNicIdentifier {
  @XmlElement(name = "HostPlacedVirtualNicIdentifier")
  protected List<HostPlacedVirtualNicIdentifier> hostPlacedVirtualNicIdentifier;
  
  public List<HostPlacedVirtualNicIdentifier> getHostPlacedVirtualNicIdentifier() {
    if (this.hostPlacedVirtualNicIdentifier == null)
      this.hostPlacedVirtualNicIdentifier = new ArrayList<>(); 
    return this.hostPlacedVirtualNicIdentifier;
  }
}
