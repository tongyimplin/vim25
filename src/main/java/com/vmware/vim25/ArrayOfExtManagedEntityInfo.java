package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtManagedEntityInfo;
import com.vmware.vim25.ExtManagedEntityInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtManagedEntityInfo", propOrder = {"extManagedEntityInfo"})
public class ArrayOfExtManagedEntityInfo {
  @XmlElement(name = "ExtManagedEntityInfo")
  protected List<ExtManagedEntityInfo> extManagedEntityInfo;
  
  public List<ExtManagedEntityInfo> getExtManagedEntityInfo() {
    if (this.extManagedEntityInfo == null)
      this.extManagedEntityInfo = new ArrayList<>(); 
    return this.extManagedEntityInfo;
  }
}
