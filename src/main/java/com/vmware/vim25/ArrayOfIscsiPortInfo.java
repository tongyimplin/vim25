package com.vmware.vim25;

import com.vmware.vim25.ArrayOfIscsiPortInfo;
import com.vmware.vim25.IscsiPortInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIscsiPortInfo", propOrder = {"iscsiPortInfo"})
public class ArrayOfIscsiPortInfo {
  @XmlElement(name = "IscsiPortInfo")
  protected List<IscsiPortInfo> iscsiPortInfo;
  
  public List<IscsiPortInfo> getIscsiPortInfo() {
    if (this.iscsiPortInfo == null)
      this.iscsiPortInfo = new ArrayList<>(); 
    return this.iscsiPortInfo;
  }
}
