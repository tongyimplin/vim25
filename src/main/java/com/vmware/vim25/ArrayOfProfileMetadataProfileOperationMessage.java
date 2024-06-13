package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileMetadataProfileOperationMessage;
import com.vmware.vim25.ProfileMetadataProfileOperationMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileMetadataProfileOperationMessage", propOrder = {"profileMetadataProfileOperationMessage"})
public class ArrayOfProfileMetadataProfileOperationMessage {
  @XmlElement(name = "ProfileMetadataProfileOperationMessage")
  protected List<ProfileMetadataProfileOperationMessage> profileMetadataProfileOperationMessage;
  
  public List<ProfileMetadataProfileOperationMessage> getProfileMetadataProfileOperationMessage() {
    if (this.profileMetadataProfileOperationMessage == null)
      this.profileMetadataProfileOperationMessage = new ArrayList<>(); 
    return this.profileMetadataProfileOperationMessage;
  }
}
