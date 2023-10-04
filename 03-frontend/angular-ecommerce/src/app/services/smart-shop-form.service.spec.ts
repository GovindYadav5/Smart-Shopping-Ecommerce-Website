import { TestBed } from '@angular/core/testing';

import { SmartShopFormService } from './smart-shop-form.service';

describe('SmartShopFormService', () => {
  let service: SmartShopFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SmartShopFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
