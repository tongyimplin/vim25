package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileMetadataProfileSortSpec;
import com.vmware.vim25.ProfileMetadataProfileSortSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileMetadataProfileSortSpec", propOrder = {"profileMetadataProfileSortSpec"})
public class ArrayOfProfileMetadataProfileSortSpec {
  @XmlElement(name = "ProfileMetadataProfileSortSpec")
  protected List<ProfileMetadataProfileSortSpec> profileMetadataProfileSortSpec;
  
  public List<ProfileMetadataProfileSortSpec> getProfileMetadataProfileSortSpec() {
    if (this.profileMetadataProfileSortSpec == null)
      this.profileMetadataProfileSortSpec = new ArrayList<>(); 
    return this.profileMetadataProfileSortSpec;
  }
}
