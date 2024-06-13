package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestAuthAliasInfo;
import com.vmware.vim25.GuestAuthAliasInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestAuthAliasInfo", propOrder = {"guestAuthAliasInfo"})
public class ArrayOfGuestAuthAliasInfo {
  @XmlElement(name = "GuestAuthAliasInfo")
  protected List<GuestAuthAliasInfo> guestAuthAliasInfo;
  
  public List<GuestAuthAliasInfo> getGuestAuthAliasInfo() {
    if (this.guestAuthAliasInfo == null)
      this.guestAuthAliasInfo = new ArrayList<>(); 
    return this.guestAuthAliasInfo;
  }
}
