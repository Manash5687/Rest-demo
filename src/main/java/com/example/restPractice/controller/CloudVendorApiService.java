package com.example.restPractice.controller;
import com.example.restPractice.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorApiService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorById( @PathVariable String vendorId) {

//        return new CloudVendor("C1", "Vendor 1", "Adress 1", "XXXX");
        return cloudVendor;
    }
   @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
    this.cloudVendor = cloudVendor;
        return "Cloud Vendor details created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor details updated successfully";
    }
   @DeleteMapping("{vendorId}")
    public String deleteCloudVendorById( @PathVariable String vendorId) {
        this.cloudVendor = null;
        return "Cloud Vendor details deleted successfully";
    }

}
