package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOvfFileItem;
import com.vmware.vim25.OvfFileItem;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOvfFileItem", propOrder = {"ovfFileItem"})
public class ArrayOfOvfFileItem {
  @XmlElement(name = "OvfFileItem")
  protected List<OvfFileItem> ovfFileItem;
  
  public List<OvfFileItem> getOvfFileItem() {
    if (this.ovfFileItem == null)
      this.ovfFileItem = new ArrayList<>(); 
    return this.ovfFileItem;
  }
}
