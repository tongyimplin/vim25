package com.vmware.vim25;

import com.vmware.vim25.ExpiredFeatureLicense;
import com.vmware.vim25.FailToEnableSPBM;
import com.vmware.vim25.HostInventoryFull;
import com.vmware.vim25.InUseFeatureManipulationDisallowed;
import com.vmware.vim25.IncorrectHostInformation;
import com.vmware.vim25.InvalidEditionLicense;
import com.vmware.vim25.InventoryHasStandardAloneHosts;
import com.vmware.vim25.LicenseDowngradeDisallowed;
import com.vmware.vim25.LicenseExpired;
import com.vmware.vim25.LicenseKeyEntityMismatch;
import com.vmware.vim25.LicenseRestricted;
import com.vmware.vim25.LicenseSourceUnavailable;
import com.vmware.vim25.NoLicenseServerConfigured;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.VmLimitLicense;
import com.vmware.vim25.VramLimitLicense;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotEnoughLicenses")
@XmlSeeAlso({HostInventoryFull.class, LicenseKeyEntityMismatch.class, VramLimitLicense.class, LicenseExpired.class, LicenseSourceUnavailable.class, InventoryHasStandardAloneHosts.class, VmLimitLicense.class, NoLicenseServerConfigured.class, FailToEnableSPBM.class, LicenseRestricted.class, IncorrectHostInformation.class, InvalidEditionLicense.class, LicenseDowngradeDisallowed.class, InUseFeatureManipulationDisallowed.class, ExpiredFeatureLicense.class})
public class NotEnoughLicenses extends RuntimeFault {}
