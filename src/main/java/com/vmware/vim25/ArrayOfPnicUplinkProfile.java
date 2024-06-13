package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPnicUplinkProfile;
import com.vmware.vim25.PnicUplinkProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPnicUplinkProfile", propOrder = {"pnicUplinkProfile"})
public class ArrayOfPnicUplinkProfile {
  @XmlElement(name = "PnicUplinkProfile")
  protected List<PnicUplinkProfile> pnicUplinkProfile;
  
  public List<PnicUplinkProfile> getPnicUplinkProfile() {
    if (this.pnicUplinkProfile == null)
      this.pnicUplinkProfile = new ArrayList<>(); 
    return this.pnicUplinkProfile;
  }
}
