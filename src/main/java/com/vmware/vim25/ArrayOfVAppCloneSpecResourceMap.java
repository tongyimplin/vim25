package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVAppCloneSpecResourceMap;
import com.vmware.vim25.VAppCloneSpecResourceMap;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVAppCloneSpecResourceMap", propOrder = {"vAppCloneSpecResourceMap"})
public class ArrayOfVAppCloneSpecResourceMap {
  @XmlElement(name = "VAppCloneSpecResourceMap")
  protected List<VAppCloneSpecResourceMap> vAppCloneSpecResourceMap;
  
  public List<VAppCloneSpecResourceMap> getVAppCloneSpecResourceMap() {
    if (this.vAppCloneSpecResourceMap == null)
      this.vAppCloneSpecResourceMap = new ArrayList<>(); 
    return this.vAppCloneSpecResourceMap;
  }
}
