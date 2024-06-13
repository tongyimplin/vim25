package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileParameterMetadata;
import com.vmware.vim25.ProfileParameterMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileParameterMetadata", propOrder = {"profileParameterMetadata"})
public class ArrayOfProfileParameterMetadata {
  @XmlElement(name = "ProfileParameterMetadata")
  protected List<ProfileParameterMetadata> profileParameterMetadata;
  
  public List<ProfileParameterMetadata> getProfileParameterMetadata() {
    if (this.profileParameterMetadata == null)
      this.profileParameterMetadata = new ArrayList<>(); 
    return this.profileParameterMetadata;
  }
}
