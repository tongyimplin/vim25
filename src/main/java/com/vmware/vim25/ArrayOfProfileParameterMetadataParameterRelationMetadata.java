package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileParameterMetadataParameterRelationMetadata;
import com.vmware.vim25.ProfileParameterMetadataParameterRelationMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileParameterMetadataParameterRelationMetadata", propOrder = {"profileParameterMetadataParameterRelationMetadata"})
public class ArrayOfProfileParameterMetadataParameterRelationMetadata {
  @XmlElement(name = "ProfileParameterMetadataParameterRelationMetadata")
  protected List<ProfileParameterMetadataParameterRelationMetadata> profileParameterMetadataParameterRelationMetadata;
  
  public List<ProfileParameterMetadataParameterRelationMetadata> getProfileParameterMetadataParameterRelationMetadata() {
    if (this.profileParameterMetadataParameterRelationMetadata == null)
      this.profileParameterMetadataParameterRelationMetadata = new ArrayList<>(); 
    return this.profileParameterMetadataParameterRelationMetadata;
  }
}
