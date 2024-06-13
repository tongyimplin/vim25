package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPatchManagerStatusPrerequisitePatch;
import com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPatchManagerStatusPrerequisitePatch", propOrder = {"hostPatchManagerStatusPrerequisitePatch"})
public class ArrayOfHostPatchManagerStatusPrerequisitePatch {
  @XmlElement(name = "HostPatchManagerStatusPrerequisitePatch")
  protected List<HostPatchManagerStatusPrerequisitePatch> hostPatchManagerStatusPrerequisitePatch;
  
  public List<HostPatchManagerStatusPrerequisitePatch> getHostPatchManagerStatusPrerequisitePatch() {
    if (this.hostPatchManagerStatusPrerequisitePatch == null)
      this.hostPatchManagerStatusPrerequisitePatch = new ArrayList<>(); 
    return this.hostPatchManagerStatusPrerequisitePatch;
  }
}
