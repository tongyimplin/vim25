package com.vmware.vim25;

import com.vmware.vim25.ArrayOfEntityBackupConfig;
import com.vmware.vim25.EntityBackupConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntityBackupConfig", propOrder = {"entityBackupConfig"})
public class ArrayOfEntityBackupConfig {
  @XmlElement(name = "EntityBackupConfig")
  protected List<EntityBackupConfig> entityBackupConfig;
  
  public List<EntityBackupConfig> getEntityBackupConfig() {
    if (this.entityBackupConfig == null)
      this.entityBackupConfig = new ArrayList<>(); 
    return this.entityBackupConfig;
  }
}
