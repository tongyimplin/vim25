package com.vmware.vim25;

import com.vmware.vim25.ArrayOfLocalizationManagerMessageCatalog;
import com.vmware.vim25.LocalizationManagerMessageCatalog;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocalizationManagerMessageCatalog", propOrder = {"localizationManagerMessageCatalog"})
public class ArrayOfLocalizationManagerMessageCatalog {
  @XmlElement(name = "LocalizationManagerMessageCatalog")
  protected List<LocalizationManagerMessageCatalog> localizationManagerMessageCatalog;
  
  public List<LocalizationManagerMessageCatalog> getLocalizationManagerMessageCatalog() {
    if (this.localizationManagerMessageCatalog == null)
      this.localizationManagerMessageCatalog = new ArrayList<>(); 
    return this.localizationManagerMessageCatalog;
  }
}
