package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtendedDescription;
import com.vmware.vim25.ProfileMetadata;
import com.vmware.vim25.ProfileMetadataProfileOperationMessage;
import com.vmware.vim25.ProfileMetadataProfileSortSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileMetadata", propOrder = {"key", "profileTypeName", "description", "sortSpec", "profileCategory", "profileComponent", "operationMessages"})
public class ProfileMetadata extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected String profileTypeName;
  
  protected ExtendedDescription description;
  
  protected List<ProfileMetadataProfileSortSpec> sortSpec;
  
  protected String profileCategory;
  
  protected String profileComponent;
  
  protected List<ProfileMetadataProfileOperationMessage> operationMessages;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getProfileTypeName() {
    return this.profileTypeName;
  }
  
  public void setProfileTypeName(String paramString) {
    this.profileTypeName = paramString;
  }
  
  public ExtendedDescription getDescription() {
    return this.description;
  }
  
  public void setDescription(ExtendedDescription paramExtendedDescription) {
    this.description = paramExtendedDescription;
  }
  
  public List<ProfileMetadataProfileSortSpec> getSortSpec() {
    if (this.sortSpec == null)
      this.sortSpec = new ArrayList<>(); 
    return this.sortSpec;
  }
  
  public String getProfileCategory() {
    return this.profileCategory;
  }
  
  public void setProfileCategory(String paramString) {
    this.profileCategory = paramString;
  }
  
  public String getProfileComponent() {
    return this.profileComponent;
  }
  
  public void setProfileComponent(String paramString) {
    this.profileComponent = paramString;
  }
  
  public List<ProfileMetadataProfileOperationMessage> getOperationMessages() {
    if (this.operationMessages == null)
      this.operationMessages = new ArrayList<>(); 
    return this.operationMessages;
  }
}
