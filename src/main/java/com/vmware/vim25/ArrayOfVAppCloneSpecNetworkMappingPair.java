package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVAppCloneSpecNetworkMappingPair;
import com.vmware.vim25.VAppCloneSpecNetworkMappingPair;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppCloneSpecNetworkMappingPair", propOrder = {"vAppCloneSpecNetworkMappingPair"})
public class ArrayOfVAppCloneSpecNetworkMappingPair {
  @XmlElement(name = "VAppCloneSpecNetworkMappingPair")
  protected List<VAppCloneSpecNetworkMappingPair> vAppCloneSpecNetworkMappingPair;
  
  public List<VAppCloneSpecNetworkMappingPair> getVAppCloneSpecNetworkMappingPair() {
    if (this.vAppCloneSpecNetworkMappingPair == null)
      this.vAppCloneSpecNetworkMappingPair = new ArrayList<>(); 
    return this.vAppCloneSpecNetworkMappingPair;
  }
}
