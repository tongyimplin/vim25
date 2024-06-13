package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtendedElementDescription;
import com.vmware.vim25.ProfileParameterMetadata;
import com.vmware.vim25.ProfileParameterMetadataParameterRelationMetadata;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileParameterMetadata", propOrder = {"id", "type", "optional", "defaultValue", "hidden", "securitySensitive", "readOnly", "parameterRelations"})
public class ProfileParameterMetadata extends DynamicData {
  @XmlElement(required = true)
  protected ExtendedElementDescription id;
  
  @XmlElement(required = true)
  protected String type;
  
  protected boolean optional;
  
  protected Object defaultValue;
  
  protected Boolean hidden;
  
  protected Boolean securitySensitive;
  
  protected Boolean readOnly;
  
  protected List<ProfileParameterMetadataParameterRelationMetadata> parameterRelations;
  
  public ExtendedElementDescription getId() {
    return this.id;
  }
  
  public void setId(ExtendedElementDescription paramExtendedElementDescription) {
    this.id = paramExtendedElementDescription;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public boolean isOptional() {
    return this.optional;
  }
  
  public void setOptional(boolean paramBoolean) {
    this.optional = paramBoolean;
  }
  
  public Object getDefaultValue() {
    return this.defaultValue;
  }
  
  public void setDefaultValue(Object paramObject) {
    this.defaultValue = paramObject;
  }
  
  public Boolean isHidden() {
    return this.hidden;
  }
  
  public void setHidden(Boolean paramBoolean) {
    this.hidden = paramBoolean;
  }
  
  public Boolean isSecuritySensitive() {
    return this.securitySensitive;
  }
  
  public void setSecuritySensitive(Boolean paramBoolean) {
    this.securitySensitive = paramBoolean;
  }
  
  public Boolean isReadOnly() {
    return this.readOnly;
  }
  
  public void setReadOnly(Boolean paramBoolean) {
    this.readOnly = paramBoolean;
  }
  
  public List<ProfileParameterMetadataParameterRelationMetadata> getParameterRelations() {
    if (this.parameterRelations == null)
      this.parameterRelations = new ArrayList<>(); 
    return this.parameterRelations;
  }
}
