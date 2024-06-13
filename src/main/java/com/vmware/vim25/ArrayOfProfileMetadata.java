package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileMetadata;
import com.vmware.vim25.ProfileMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileMetadata", propOrder = {"profileMetadata"})
public class ArrayOfProfileMetadata {
  @XmlElement(name = "ProfileMetadata")
  protected List<ProfileMetadata> profileMetadata;
  
  public List<ProfileMetadata> getProfileMetadata() {
    if (this.profileMetadata == null)
      this.profileMetadata = new ArrayList<>(); 
    return this.profileMetadata;
  }
}
