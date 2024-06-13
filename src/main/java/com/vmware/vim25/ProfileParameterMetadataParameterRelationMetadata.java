package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProfileParameterMetadataParameterRelationMetadata;
import com.vmware.vim25.ProfilePropertyPath;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileParameterMetadataParameterRelationMetadata", propOrder = {"relationTypes", "values", "path", "minCount", "maxCount"})
public class ProfileParameterMetadataParameterRelationMetadata extends DynamicData {
  protected List<String> relationTypes;
  
  protected List<Object> values;
  
  protected ProfilePropertyPath path;
  
  protected int minCount;
  
  protected int maxCount;
  
  public List<String> getRelationTypes() {
    if (this.relationTypes == null)
      this.relationTypes = new ArrayList<>(); 
    return this.relationTypes;
  }
  
  public List<Object> getValues() {
    if (this.values == null)
      this.values = new ArrayList(); 
    return this.values;
  }
  
  public ProfilePropertyPath getPath() {
    return this.path;
  }
  
  public void setPath(ProfilePropertyPath paramProfilePropertyPath) {
    this.path = paramProfilePropertyPath;
  }
  
  public int getMinCount() {
    return this.minCount;
  }
  
  public void setMinCount(int paramInt) {
    this.minCount = paramInt;
  }
  
  public int getMaxCount() {
    return this.maxCount;
  }
  
  public void setMaxCount(int paramInt) {
    this.maxCount = paramInt;
  }
}
