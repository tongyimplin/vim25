package com.vmware.vim25;

import com.vmware.vim25.HostProfileSerializedHostProfileSpec;
import com.vmware.vim25.ProfileCreateSpec;
import com.vmware.vim25.ProfileSerializedCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileSerializedCreateSpec", propOrder = {"profileConfigString"})
@XmlSeeAlso({HostProfileSerializedHostProfileSpec.class})
public class ProfileSerializedCreateSpec extends ProfileCreateSpec {
  @XmlElement(required = true)
  protected String profileConfigString;
  
  public String getProfileConfigString() {
    return this.profileConfigString;
  }
  
  public void setProfileConfigString(String paramString) {
    this.profileConfigString = paramString;
  }
}
